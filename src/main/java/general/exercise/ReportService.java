package general.exercise;

import java.util.HashSet;
import java.util.Set;

//ReportService.java is a simple class with a single dependency: ReportGenerator.
//However, the code could look a bit better, and your task is to refactor it.

//processReports()'s argument should be generalised: you should accept any kind of set, not just HashSet
//ReportGenerator is an interface implemented by only one class: ReportGeneratorImpl.
//Since there is just one implementation and we don't think any other will ever appear, we can get rid of the interface.
//ReportGenerator should simply become a concrete class (with the implementation that is currently there in ReportGeneratorImpl) rather than an interface.
//
//After this change, the file ReportGeneratorImpl.java will no longer be needed.
// Since the Udemy platform doesn't allow you to delete a file, simply remove the class declaration from this file and just put a comment in the file like: "// skipped"

class ReportService {

    private ReportGenerator reportGenerator;

    public ReportService(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void processReports(HashSet<String> reportData) {
        // Processing logic using the reportData
        reportGenerator.generateReport(reportData);
    }

}