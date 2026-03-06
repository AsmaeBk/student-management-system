import './App.css'
import Home from './pages/Home'

import { BrowserRouter, Routes, Route, NavLink } from 'react-router-dom'
import Students from './pages/Students'
import AddStudent from './pages/AddStudent'
import StudentDetail from './pages/StudentDetail'

function App() {

  return (
    <>
    
       <BrowserRouter> 
            <nav>
                <NavLink to="/">Home</NavLink>
                <NavLink to="/students">Students</NavLink>
                <NavLink to="/add-student">Add Student</NavLink>
            </nav>
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/students" element={<Students />} />
                <Route path="/add-student" element={<AddStudent />} />
            </Routes>
        </BrowserRouter>
  
    </>
  )
}

export default App
