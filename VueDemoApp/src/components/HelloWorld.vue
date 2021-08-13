<template>
  <div class="hello">
    <button @click="svaeRecords" >Save</button>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  methods:{
    svaeRecords(){
      console.log('clicked');
      fetch('https://udemy-practice-fd933.firebaseio.com/records.json', {
      method: 'POST',
      headers:{
        'Content-type':'application/json',    
      },
      body:{
        id:1,
        fname: 'Jack',
        lname:'John',
        city:'UK'
      }
    });
    }

  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
