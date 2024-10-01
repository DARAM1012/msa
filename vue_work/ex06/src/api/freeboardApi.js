import axios from 'axios'
import {GLOBAL_URL} from './utill.js';

export const URL = `${GLOBAL_URL}/freeboard`;

export const saveFreeboard = async (formData) => {
  try {
    const res = await axios.post(`${URL}`, formData, {
      headers: {
        'Content-Type': 'multipart/form-data'
      }
    });
    return res;
  } catch (e) {
    console.log(e);
    return e;
  }
};

export const getFreeBoard = async(pageNum) => {
    if (pageNum == undefined) pageNum = 0
      
    try{
    const res = await axios.get(`${URL}?pageNum=${pageNum}`);
      return res;
    }catch(e){
        console.log(e)
        return e;
      }
  };
  