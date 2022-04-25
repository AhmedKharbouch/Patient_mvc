# **Patient mvc**
## gestion patient first commit


### Classe Patient
- Creation de la classe avec annotation Lombok

>![classpatient](https://user-images.githubusercontent.com/102327247/163622872-1217a03d-a33e-465b-a7eb-1319ca21925f.PNG)


### Controller patient
>1/2
- index

>![controleur1](https://user-images.githubusercontent.com/102327247/163613661-4bf605a4-b00f-4505-8bbc-419a8c90a045.PNG)

>2/2

- Home
- delete
- patients
>![controleur2](https://user-images.githubusercontent.com/102327247/163614701-6e51b1f4-1439-4342-8548-82481c710d1d.PNG)

### Repository patient

- Methode findByNomContains
>![patient repo](https://user-images.githubusercontent.com/102327247/163618442-2857b4f5-9a06-4caa-a02f-b42b5c0aac89.PNG)

### Thymleaf (patient.html)

>1/3
- Formulaire de recherche par nom
>![tym1](https://user-images.githubusercontent.com/102327247/163621032-9eeec41d-3ab0-4730-ade4-623130729e82.PNG)
### Result

>![search](https://user-images.githubusercontent.com/102327247/163622039-28a8c2e7-ecc7-4ae5-bf21-6e133e469131.PNG)

>2/3

- Lister les patients dans le tableau avec boutton DELETE
>![tym2](https://user-images.githubusercontent.com/102327247/163621517-4d4d9397-eedb-48af-b3d4-92f6e1bd9a03.PNG)
>Result
>![tableau](https://user-images.githubusercontent.com/102327247/163622058-f9bfef0f-cc9b-4e7b-bcb9-bfcbf0b66165.PNG)

>2/3

- Liens de Pagination
>![tym3](https://user-images.githubusercontent.com/102327247/163621642-3c0b9b24-db86-47f3-9bd4-1a67572b21ab.PNG)
### Result
>![pages](https://user-images.githubusercontent.com/102327247/163622072-e4aa32fe-0f3c-4966-b57f-1d4cedff9447.PNG)

## Resultat final
>![resultfinal](https://user-images.githubusercontent.com/102327247/163622526-a49b016f-62b1-4d6e-9c53-e8cb2dedbe33.PNG)

# **___________________________END FIRST COMMIT___________________________**

# **Patient mvc second commit**
## gestion patient second commit

### add new html file
- (editPatient.html,formPatients) 

>1/2

>![editpatient1](https://user-images.githubusercontent.com/102327247/164128694-3a6a4c47-200e-460f-8272-d4e084b85607.PNG)

>2/2

>![editpatient2](https://user-images.githubusercontent.com/102327247/164128706-3d5c022c-e6d4-4b36-88a6-783804f47d72.PNG)

>![resultedit](https://user-images.githubusercontent.com/102327247/164128736-7454ec8b-06f7-45cb-b898-e71ef4ff1335.PNG)

>1/2

>![formpatient](https://user-images.githubusercontent.com/102327247/164128952-d27f71e8-a3fc-4e4e-9c96-1f53456b5b53.PNG)

>2/2

>![formpatient2](https://user-images.githubusercontent.com/102327247/164128972-bf5849f8-6c3f-4430-b2e3-5b2a5bca63ce.PNG)

### Result

### ajout des dependences pour le layout et la validation du formulaire patient

-dependence

>![dependency](https://user-images.githubusercontent.com/102327247/164129339-93bd9913-b5dd-4cf7-953d-38c753ab291d.PNG)

### layout pour la navbar( template1.html )

>1/3

>![layout1](https://user-images.githubusercontent.com/102327247/164129463-b19737f0-90be-45df-bd65-357928092531.PNG)

>2/3

>![layout2](https://user-images.githubusercontent.com/102327247/164129484-39f55c20-ca2d-4e1b-a2b2-9fad0a2110a1.PNG)

>3/3

>![layout3](https://user-images.githubusercontent.com/102327247/164129492-d1b2a651-afed-4996-b92d-1d27dcac21c7.PNG)

### Layout result

>![layout result](https://user-images.githubusercontent.com/102327247/164129534-850b7692-d4e0-40c1-bfe1-f4ed9e887b91.PNG)

### Rendu graphique apres plusieurs modifications dans le code html

![finale result](https://user-images.githubusercontent.com/102327247/164129759-cb8094b3-c325-43f3-9e1c-a0c924cf99a8.PNG)

# **___________________________END SECOND COMMIT___________________________**

# **Patient mvc third commit**
## gestion patient third commit

### add dependency for spring security 5

> ![dependency](https://user-images.githubusercontent.com/102327247/164948502-d1430391-14d3-4e93-a8e0-567f710b6a35.PNG)

### add class (securityconfig)

>1/2



>![securityconfig1](https://user-images.githubusercontent.com/102327247/164948556-9eb7f664-282f-4d26-a5d9-e2864c42c61e.PNG)

>2/2

-Using jdbcauthentification (database methode) to get role
-Test the login and password 
-Hash password with predefined methode called passwordEnconder() contain instance of BCryptPasswordEncoder()
handle url escale breach by using (antMatchers()) for path and (hasRole()) for roles

>![securityconfig2](https://user-images.githubusercontent.com/102327247/164948558-0d6165e1-8694-4589-a4d3-1bba041ae8d7.PNG)

### add controller security (SecurityController)

-mapping to 403 page (403.html)

>1/2
>![page404](https://user-images.githubusercontent.com/102327247/164949745-3277706f-a9c0-4738-acf9-d6490240a54f.PNG)

### result


### update PatientController

-Update path to /user/** or /admin/**

>1/5

>![1](https://user-images.githubusercontent.com/102327247/164949948-0d434ed8-7d56-444f-8a30-2459758e0321.PNG)

>2/5

>![2](https://user-images.githubusercontent.com/102327247/164949954-e291ef8a-3b1c-44a6-b8e8-c05577887e77.PNG)

>3/5

>![3](https://user-images.githubusercontent.com/102327247/164949958-7c1a3cda-9925-43bf-baa9-8540c1655844.PNG)

>4/5

>![4](https://user-images.githubusercontent.com/102327247/164949960-520b2d0e-f94a-4dca-aa61-affcab307d9e.PNG)

>5/5

>![5](https://user-images.githubusercontent.com/102327247/164949985-bbff74a6-df3f-4f36-86c9-77af7a37b316.PNG)

### update template.html 

-using sec:authorize="isAuthenticated()" and sec:authorize="hasRole()" to hide or show nav-link 

>![hasrole_template](https://user-images.githubusercontent.com/102327247/164950187-9a1f46e1-fb1f-409e-be37-1ce7d9a287e5.PNG)



### Layout result

-Login

>![login_page](https://user-images.githubusercontent.com/102327247/164950016-bab0af45-17be-46da-bddd-00ca5ab5fa64.PNG)

-Logout

>![logout](https://user-images.githubusercontent.com/102327247/164950035-428ef359-51e5-465e-bd8c-07376d459801.PNG)

-Confirm Logout

![confirmation_logout](https://user-images.githubusercontent.com/102327247/164950039-9bd71f56-6c1f-46b1-a8a8-aa707c74ade1.PNG)

-home page without login permitAll();

>![indexwithoutlogin](https://user-images.githubusercontent.com/102327247/164950073-7a9d428c-6889-4d93-87e4-dc6f597da50f.PNG)

-Page for user role

>![menu_role_user](https://user-images.githubusercontent.com/102327247/164950094-72203a8a-e795-445d-9ede-6188ab9e2ae5.PNG)

-Page for admin role

>![menu_role_admin](https://user-images.githubusercontent.com/102327247/164950102-1ff88d7e-741b-4b2f-85d3-384486614c52.PNG)

# **___________________________END THIRD COMMIT___________________________**




















