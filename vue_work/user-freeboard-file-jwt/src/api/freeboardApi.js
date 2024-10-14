import axios from 'axios';
import { GLOBAL_URL } from './util.js';

export const URL = `${GLOBAL_URL}/freeboard`;

export const saveFreeboard = async (formData) => {
  const token = localStorage.getItem('token');
  try {
    const res = await axios.post(`${URL}`, formData, {
      headers: {
        'Content-Type': 'multipart/form-data',
        'Authorization': 'Bearer ' +token
      }
    });
    return res;
  } catch (e) {
    console.log(e);
    return e;
  }
};
export const getFreeBoard = async (pageNum) => {
  const token = localStorage.getItem('token');
  if (pageNum == undefined) pageNum = 0;
  try {
    const res = await axios.get(`${URL}?pageNum=${pageNum}`,{
      headers: {
        'Content-Type': 'application/json',
        'Authorization': 'Bearer ' +token
      }
    });
    return res;
  } catch (e) {
    console.log(e);
    return e;
  }
};

export const getFreeBoardView = async (idx) => {
  console.log(`${URL}/view/${idx}`);
  try {
    const res = await axios.get(`${URL}/view/${idx}`);
    return res;
  } catch (e) {
    console.log(e);
    return e;
  }
};

export const freeboardDelete = async (idx) => {
  try {
    const res = await axios.delete(`${URL}/delete/${idx}`);
    return res;
  } catch (e) {
    console.log(e);
    return e;
  }
};
