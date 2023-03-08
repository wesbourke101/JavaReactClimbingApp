import Root from "./routes/Root"
import ReactRouterErrorPage from "./errorMessages/ReactRouterErrorPage";
import Contact from "./routes/Contact";
import React from "react";
import ReactDOM from 'react-dom/client';
import {
  createBrowserRouter,
  RouterProvider,
} from "react-router-dom";




const router = createBrowserRouter([
  {
    path: "/",
    element: <Root />,
    errorElement: <ReactRouterErrorPage />,
  },
  {
    path: "contacts/:contactId",
    element: <Contact />,
  },
]);


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <RouterProvider router={router} /> 
  </React.StrictMode>
);

