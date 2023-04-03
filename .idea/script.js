// Create an array to hold the names of the family members
var familyMembers = ["Martin","Hannah","Sam","Adan","Shelagh","Andy"];

// Shuffle the array to randomly assign each family member a person to buy a gift for
function shuffleArray(array) {
for (var i = array.length - 1; i > 0; i--) {
var j = Math.floor(Math.random() * (i + 1));
var temp = array[i];
array[i] = array[j];
array[j] = temp;
}
}

// Function to check if the constraint is satisfied
function isConstraintSatisfied(giver, receiver) {
if ((giver == "Martin" && receiver == "Hannah") ||
(giver == "Hannah" && receiver == "Martin") ||
(giver == "Sam" && receiver == "Adan") ||
(giver == "Adan" && receiver == "Sam") ||
(giver == "Shelagh" && receiver == "Andy") ||
(giver == "Andy" && receiver == "Shelagh")) {
return false;
}
return true;
}

// Create an object to store the Secret Santa assignments
var assignments = {};

// Shuffle the array until we find a valid assignment
while (true) {
shuffleArray(familyMembers);
var valid = true;
for (var i = 0; i < familyMembers.length; i++) {
var giver = familyMembers[i];
var receiver = familyMembers[(i + 1) % familyMembers.length];
if (!isConstraintSatisfied(giver, receiver)) {
valid = false;
break;
}
}
if (valid) {
for (var i = 0; i < familyMembers.length; i++) {
var giver = familyMembers[i];
var receiver = familyMembers[(i + 1) % familyMembers.length];
assignments[giver] = receiver;
}
break;
}
}

// Find the Santa for the entered name
function findSanta() {
var name = document.getElementById("name").value;
var santa = assignments[name];
var result = document.getElementById("result");
result.innerHTML = "Your Secret Santa is " + santa;
}

