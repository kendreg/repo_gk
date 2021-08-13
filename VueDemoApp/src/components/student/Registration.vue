<template>    
    <div class="form-submit">
			<div v-if="!isSubmitted">
				<h2>Student Registration</h2>
				<div class="form-group">
					<label for="stdid">Id: {{newId}}</label>
				</div>

				<div class="form-group">		
					<label for="name">Name</label>
					<input
					type="text"
					class="form-control"
					placeholder="Enter name"
					id="name"
					required
					v-model="details.stdname"
					name="name"
					/>							
				</div>

				<div class="form-group">
					<label for="email">Email</label>
					<input
						placeholder="Enter email id"
						type="email"
						v-model="details.email"
						required
						class="form-control"
						name="email"
						id="email"
					/>
				</div>
				<button class="btn btn-success" @click="finishRegistration">Submit</button>
			</div>
			<div v-else>
				<h4>Registration successful!</h4>		
				<button class="btn btn-success" @click="newResitration">Add</button>		
			</div>
    </div>
</template>

<script>

import StudentService from '../../services/StudentService';
    export default{
			data(){
				return{
					details:{						
						studentId:0,
						stdname:'',
						email:''
					},
					isSubmitted: false
				}
			},
			methods:{
				finishRegistration(){
					var data = {
					studentId: this.details.studentId,
					stdname: this.details.stdname,
					email: this.details.email
				};

				console.log(data);

				StudentService.create(data)
					.then(response => {
						this.details.studentId = response.data.id;
						console.log(response.data);
						this.submitted = true;
					})
					.catch(e => {
						console.log(e);
					});
				},
				newResitration(){
					this.isSubmitted = false,
					this.details={}
				}
			},
			computed:{
				newId(){
					return this.details.studentId === 0 ? '1' : this.details.studentId
				}
			}
    }
</script>

<style scoped>
	.form-submit{
		max-width: 300px;
		margin: auto;
	}
</style>