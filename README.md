# HealthSolutionsSmooks

Initial commit of Health Solutions Smook modifications.

This is a customized version of Smooks with the "segcodename" added for
Health Solutions to allow for the processing of the 837s for generating
the 835s to be sent into NextGen.

To make, check out.   Do "mvn clean install" in smooks-1.7.1 and then
for each HCCP835 and HCCP837 "mvn clean install" first in the ejc-gen, then
in the ejc-use directories.

So, in Outline
   1.)  HCCP837
        a.)  ejc-gen
             "mvn clean install"
        b.)  ejc-gen
             "mvn clean install"

You may need to do a little editing of the maven files based on your locations
on the file system.
