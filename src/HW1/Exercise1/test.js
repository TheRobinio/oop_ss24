import {HeadOfExaminationBoard, HeadOfTheDepartment, Person} from "./person.js";

const prof1 = Person("Karl","Lagerfeld",45)
console.log(prof1)

const headExam = HeadOfExaminationBoard("Klaus","Meyer",28, "full professor","W2","Software Engineering")
console.log(headExam.getDescription())

const headDepart = HeadOfTheDepartment("Wilhem","Müller",73, "full professor","W2","AI")
console.log(headDepart.getInfo())
