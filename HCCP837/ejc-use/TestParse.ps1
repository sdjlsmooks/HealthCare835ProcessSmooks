Get-ChildItem "C:\Users\sdjl\projects\HealthSolutions835\hccp837\ejc-use\test-dataHS\*" -Recurse -Filter *.edi | 
Foreach-Object {
    $content = Get-Content $_.FullName
    Write-Output $_.FullName
    java -jar Use837.jar $_.FullName
    if ($LastExitCode -eq 1) {
       Write-Output "****TEST FAILURE***"  
       Exit
    }
}
