import { createApp } from 'vue'
//import Vue from 'vue';
import App from './App.vue'
import router from './router'
import {createStore} from 'vuex';

import 'bootstrap'
import 'bootstrap/dist/css/bootstrap.min.css';

const store = createStore({
  state(){
    return{
      
    }
  }
});

createApp(App).use(router, store).mount('#app');

