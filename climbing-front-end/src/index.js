import Root from "./routes/Root"
import MapBoxClimbs from "./routes/MapBoxClimbs"

import ReactRouterErrorPage from "./errorMessages/ReactRouterErrorPage";
import React from "react";
import ReactDOM from 'react-dom/client';

import {
  createBrowserRouter,
  RouterProvider,
} from "react-router-dom";




const router = createBrowserRouter([
  {
    path: "/",
    element: <MapBoxClimbs />,
    errorElement: <ReactRouterErrorPage />,
  },
  {
    path: "/testData",
    element: <Root />,
    errorElement: <ReactRouterErrorPage />,
  },
]);


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <RouterProvider router={router} /> 
  </React.StrictMode>
);

