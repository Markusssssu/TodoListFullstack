import axios from "axios";

const BASE_URL = "http://localhost:8080/api/v1/employees"


export default {
    getEmployees(){
        return axios.get(BASE_URL);
    },
    getEmployeeById(id){
        return axios.get(`${BASE_URL}/${id}`);
    },
    addEmployee(employee){
        return axios.post(`${BASE_URL}/add`,employee);
    },
    updateEmployee(employee){
        return axios.put(`${BASE_URL}/update`,employee);
    },
    deleteEmployee(id){
        return axios.delete(`${BASE_URL}/delete/${id}`);
    }
}