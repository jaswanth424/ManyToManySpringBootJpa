# ManyToMany
- Many students are mapped to Many courses.
- Bridge table gets created along with student, student_seq, course, course_seq
# Model
Student
Course
- both have @ManyToMany annotation
- both will have list of Studetns and list of courses
# Student
- owning table.
- create a bridge table using @JoinTable(@JoinColumn and @InverseJoinColumn keys)

# Course
- non-owning table.
- just have a mappedBy key
# Request
curl --location 'http://localhost:9095/saveStudent' \
--header 'Content-Type: application/json' \
--data '{
"studentName":"Shyam",
"city":"Ottawa",
"courses":[{
"courseName":"SpringBoot",
"fee":1000
},{
"courseName":"Microservices",
"fee":3000
}]
}'

# Response
{
"studentId": 2,
"studentName": "Shyam",
"city": "Ottawa",
"courses": [
{
"courseId": 3,
"courseName": "Microservices",
"fee": 3000,
"students": null
},
{
"courseId": 4,
"courseName": "SpringBoot",
"fee": 1000,
"students": null
}
]
}