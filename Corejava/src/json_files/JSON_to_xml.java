package json_files;

import org.json.*;
public class JSON_to_xml {
public static void main(String[]args)
{
	String jsonString="{\r\n"
			+ "  \"employees\": [\r\n"
			+ "    { \"id\": 1, \"name\": \"Alice Johnson\", \"position\": \"Java Developer\", \"department\": \"Backend\", \"salary\": 65000 },\r\n"
			+ "    { \"id\": 2, \"name\": \"Bob Smith\", \"position\": \"React Developer\", \"department\": \"Frontend\", \"salary\": 62000 },\r\n"
			+ "    { \"id\": 3, \"name\": \"Charlie Lee\", \"position\": \"UI/UX Designer\", \"department\": \"Design\", \"salary\": 58000 },\r\n"
			+ "    { \"id\": 4, \"name\": \"David Clark\", \"position\": \"DevOps Engineer\", \"department\": \"DevOps\", \"salary\": 70000 },\r\n"
			+ "    { \"id\": 5, \"name\": \"Eva Green\", \"position\": \"Project Manager\", \"department\": \"Management\", \"salary\": 80000 },\r\n"
			+ "    { \"id\": 6, \"name\": \"Frank Wright\", \"position\": \"Python Developer\", \"department\": \"Backend\", \"salary\": 64000 },\r\n"
			+ "    { \"id\": 7, \"name\": \"Grace Kim\", \"position\": \"HR Executive\", \"department\": \"HR\", \"salary\": 45000 },\r\n"
			+ "    { \"id\": 8, \"name\": \"Henry Evans\", \"position\": \"QA Tester\", \"department\": \"Testing\", \"salary\": 52000 },\r\n"
			+ "    { \"id\": 9, \"name\": \"Isla Scott\", \"position\": \"Data Scientist\", \"department\": \"Analytics\", \"salary\": 78000 },\r\n"
			+ "    { \"id\": 10, \"name\": \"Jack Wilson\", \"position\": \"Network Engineer\", \"department\": \"Infrastructure\", \"salary\": 60000 },\r\n"
			+ "    { \"id\": 11, \"name\": \"Karen Hill\", \"position\": \"Business Analyst\", \"department\": \"Business\", \"salary\": 67000 },\r\n"
			+ "    { \"id\": 12, \"name\": \"Leo Adams\", \"position\": \"Mobile Developer\", \"department\": \"App Dev\", \"salary\": 61000 },\r\n"
			+ "    { \"id\": 13, \"name\": \"Mia Brooks\", \"position\": \"Content Writer\", \"department\": \"Marketing\", \"salary\": 43000 },\r\n"
			+ "    { \"id\": 14, \"name\": \"Noah Perry\", \"position\": \"Product Owner\", \"department\": \"Management\", \"salary\": 85000 },\r\n"
			+ "    { \"id\": 15, \"name\": \"Olivia Ross\", \"position\": \"Frontend Intern\", \"department\": \"Frontend\", \"salary\": 25000 },\r\n"
			+ "    { \"id\": 16, \"name\": \"Paul Rogers\", \"position\": \"Database Admin\", \"department\": \"Backend\", \"salary\": 68000 },\r\n"
			+ "    { \"id\": 17, \"name\": \"Quinn Morgan\", \"position\": \"Security Analyst\", \"department\": \"Security\", \"salary\": 72000 },\r\n"
			+ "    { \"id\": 18, \"name\": \"Rachel Cooper\", \"position\": \"Full Stack Dev\", \"department\": \"Dev\", \"salary\": 75000 },\r\n"
			+ "    { \"id\": 19, \"name\": \"Sam Mitchell\", \"position\": \"Scrum Master\", \"department\": \"Management\", \"salary\": 77000 },\r\n"
			+ "    { \"id\": 20, \"name\": \"Tina Hughes\", \"position\": \"SEO Specialist\", \"department\": \"Marketing\", \"salary\": 50000 },\r\n"
			+ "    { \"id\": 21, \"name\": \"Uma Patel\", \"position\": \"Cloud Architect\", \"department\": \"Cloud\", \"salary\": 90000 },\r\n"
			+ "    { \"id\": 22, \"name\": \"Victor Knight\", \"position\": \"Backend Intern\", \"department\": \"Backend\", \"salary\": 24000 },\r\n"
			+ "    { \"id\": 23, \"name\": \"Wendy James\", \"position\": \"System Analyst\", \"department\": \"IT Support\", \"salary\": 62000 },\r\n"
			+ "    { \"id\": 24, \"name\": \"Xavier Gray\", \"position\": \"Technical Writer\", \"department\": \"Documentation\", \"salary\": 48000 },\r\n"
			+ "    { \"id\": 25, \"name\": \"Yara Lee\", \"position\": \"AI Engineer\", \"department\": \"R&D\", \"salary\": 94000 },\r\n"
			+ "    { \"id\": 26, \"name\": \"Zane Morris\", \"position\": \"ML Engineer\", \"department\": \"R&D\", \"salary\": 93000 },\r\n"
			+ "    { \"id\": 27, \"name\": \"Ava Diaz\", \"position\": \"Frontend Dev\", \"department\": \"Frontend\", \"salary\": 60000 },\r\n"
			+ "    { \"id\": 28, \"name\": \"Ben Fox\", \"position\": \"Backend Dev\", \"department\": \"Backend\", \"salary\": 64000 },\r\n"
			+ "    { \"id\": 29, \"name\": \"Clara Reed\", \"position\": \"Graphic Designer\", \"department\": \"Design\", \"salary\": 56000 },\r\n"
			+ "    { \"id\": 30, \"name\": \"Dylan Stone\", \"position\": \"Data Analyst\", \"department\": \"Analytics\", \"salary\": 69000 },\r\n"
			+ "    { \"id\": 31, \"name\": \"Ella Turner\", \"position\": \"Marketing Intern\", \"department\": \"Marketing\", \"salary\": 23000 },\r\n"
			+ "    { \"id\": 32, \"name\": \"Felix Young\", \"position\": \"Technical Lead\", \"department\": \"Backend\", \"salary\": 87000 },\r\n"
			+ "    { \"id\": 33, \"name\": \"Gina Ward\", \"position\": \"Lead QA\", \"department\": \"Testing\", \"salary\": 69000 },\r\n"
			+ "    { \"id\": 34, \"name\": \"Harvey Wells\", \"position\": \"Support Executive\", \"department\": \"IT Support\", \"salary\": 47000 },\r\n"
			+ "    { \"id\": 35, \"name\": \"Ivy Blake\", \"position\": \"CTO\", \"department\": \"Executive\", \"salary\": 120000 },\r\n"
			+ "    { \"id\": 36, \"name\": \"Jake Barnes\", \"position\": \"CFO\", \"department\": \"Executive\", \"salary\": 115000 },\r\n"
			+ "    { \"id\": 37, \"name\": \"Kylie Shaw\", \"position\": \"Recruiter\", \"department\": \"HR\", \"salary\": 46000 },\r\n"
			+ "    { \"id\": 38, \"name\": \"Liam Cross\", \"position\": \"Junior Developer\", \"department\": \"Frontend\", \"salary\": 35000 },\r\n"
			+ "    { \"id\": 39, \"name\": \"Megan Fox\", \"position\": \"Email Marketer\", \"department\": \"Marketing\", \"salary\": 49000 },\r\n"
			+ "    { \"id\": 40, \"name\": \"Nathan Bell\", \"position\": \"Java Intern\", \"department\": \"Backend\", \"salary\": 22000 },\r\n"
			+ "    { \"id\": 41, \"name\": \"Olive Hope\", \"position\": \"Data Engineer\", \"department\": \"Analytics\", \"salary\": 77000 },\r\n"
			+ "    { \"id\": 42, \"name\": \"Peter Hunt\", \"position\": \"Linux Admin\", \"department\": \"Infrastructure\", \"salary\": 65000 },\r\n"
			+ "    { \"id\": 43, \"name\": \"Queenie Joy\", \"position\": \"Payroll Officer\", \"department\": \"Finance\", \"salary\": 53000 },\r\n"
			+ "    { \"id\": 44, \"name\": \"Ronny Zane\", \"position\": \"ETL Developer\", \"department\": \"Data Warehouse\", \"salary\": 71000 },\r\n"
			+ "    { \"id\": 45, \"name\": \"Sophie Lane\", \"position\": \"Flutter Developer\", \"department\": \"App Dev\", \"salary\": 68000 },\r\n"
			+ "    { \"id\": 46, \"name\": \"Tom Yates\", \"position\": \"AI Researcher\", \"department\": \"R&D\", \"salary\": 97000 },\r\n"
			+ "    { \"id\": 47, \"name\": \"Ursula Briggs\", \"position\": \"Legal Advisor\", \"department\": \"Legal\", \"salary\": 88000 },\r\n"
			+ "    { \"id\": 48, \"name\": \"Violet Nash\", \"position\": \"Compliance Officer\", \"department\": \"Legal\", \"salary\": 86000 },\r\n"
			+ "    { \"id\": 49, \"name\": \"Will Sharp\", \"position\": \"System Engineer\", \"department\": \"Infra\", \"salary\": 69000 },\r\n"
			+ "    { \"id\": 50, \"name\": \"Zara Quinn\", \"position\": \"AI Intern\", \"department\": \"R&D\", \"salary\": 26000 }\r\n"
			+ "  ]\r\n"
			+ "}\r\n";
	
	JSONObject obj=new JSONObject(jsonString);
	String xmlString=XML.toString(obj);
	System.out.println(xmlString);
}
}
