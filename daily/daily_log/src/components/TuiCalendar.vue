<template>
    <div id="calendar"></div>
  </template>
  
  <script>
  import { onMounted } from 'vue';
  import 'tui-calendar/dist/tui-calendar.css';
  import Calendar from 'tui-calendar';
  
  export default {
    setup() {
      onMounted(() => {
        const calendar = new Calendar(document.getElementById('calendar'), {
          defaultView: 'month',
          taskView: ['task'], // can be ['task', 'allday']
          scheduleView: ['time', 'allday'], // can be ['time', 'allday']
          useCreationPopup: true,
          useDetailPopup: true,
          theme: {
            'common.border': '1px solid #ccc',
            'common.backgroundColor': '#fff',
            'common.holiday.color': '#FF0000',
            'month.schedule.color': '#00A9FF',
          },
        });
  
        // 예제 이벤트 추가
        calendar.createSchedules([
          {
            id: '1',
            calendarId: '1',
            title: 'Event 1',
            category: 'time',
            dueDateClass: '',
            start: '2024-10-01T10:00:00',
            end: '2024-10-01T12:00:00',
          },
          {
            id: '2',
            calendarId: '1',
            title: 'Event 2',
            category: 'time',
            dueDateClass: '',
            start: '2024-10-07T14:00:00',
            end: '2024-10-07T15:30:00',
          },
        ]);
      });
    },
  };
  </script>
  
  <style>
  #calendar {
    height: 800px; /* 캘린더 높이 설정 */
  }
  </style>
  