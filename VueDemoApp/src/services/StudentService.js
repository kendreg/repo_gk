import http from '../http-common';

class StudentService{
    create(data){
        return http.post('/registration', data);
    }
}
export default new StudentService();