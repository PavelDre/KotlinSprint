package org.example.lesson_2

fun main() {

    val numberOfEmployees: Short = 50
    val numberOfInterns: Short = 30
    val salaryOfEmployees = 30_000
    val salaryOfInterns = 20_000
    val employeeSalaryExpenses = numberOfEmployees * salaryOfEmployees
    val totalSalaryExpenses = numberOfEmployees * salaryOfEmployees + numberOfInterns * salaryOfInterns
    val averageSalary = (numberOfEmployees * salaryOfEmployees + numberOfInterns * salaryOfInterns) / (numberOfEmployees + numberOfInterns)

    println(employeeSalaryExpenses)
    println(totalSalaryExpenses)
    println(averageSalary)
}