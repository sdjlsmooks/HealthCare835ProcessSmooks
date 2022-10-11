DROP TABLE IF EXISTS #tmpVal
select '#THISVALUE#' procedure_code, '#SERVICEDURATION#' duration, convert(varchar(1), '0') errFlag
into #tmpVal
update #tmpVal
set errFlag = (select CASE
                          when substring(procedure_code, 1, 4) = '9083' and duration < 16 then '1'
                          when procedure_code in ('90832', '90875') and duration not between 16 and 37 then '1'
                          when procedure_code = '90834' and duration not between 38 and 52 then '1'
                          when procedure_code = '90839' and duration not between 30 and 74 then '1'
                          when procedure_code in
                               ('H0036', 'H0039', 'H2011', 'H2015', 'H2017', 'H2021', 'H2023', 'H2025', 'S5150') and
                               duration not between 8 and 247 then '1'
                          when procedure_code = 'H0037' and duration not between 248 and 480 then '1'
                          when procedure_code = 'H2014' and duration not between 8 and 480 then '1'
                          when procedure_code = 'S5151' and duration < 248 then '1'
                          when procedure_code = '90837' and duration < 53 then '1'
                          when procedure_code = '90846' and duration < 26 then '1'
                          when procedure_code = '90847' and duration < 26 then '1'
                          when procedure_code = '90849' and duration < 30 then '1'
                          when procedure_code = '90853C' and duration < 30 then '1'
                          when procedure_code = '90853A' and duration < 45 then '1'
                          when procedure_code in
                               ('H0004', 'H0006', 'H0023', 'H0034', 'H0038', 'H2027', 'H2032', 'H2033', 'T1017') and
                               duration < 8 then '1'
                          when procedure_code = 'H0005' and duration < 31 then '1'
                          when procedure_code in ('H0040', 'S9485', 'H2022', 'H2024', 'H2026') and duration < 248
                              then '1'
                          else errFlag end)
select errFlag         errorCodeIfFlagField,
       case
           when errFlag = '1' then 'HARDSTOP: DURATION is invalid for procedure code ' + procedure_code + '.'
           else '' end addToMesgIfFlagField
from #tmpVal