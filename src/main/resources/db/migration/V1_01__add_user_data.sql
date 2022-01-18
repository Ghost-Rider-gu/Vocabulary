/* Added some user's profiles for tests */
INSERT INTO profiles (id, bio, full_name, picture) VALUES (1, 'Cool guy', 'Danny Danson', '') ON CONFLICT (id) DO NOTHING;
INSERT INTO profiles (id, bio, full_name, picture) VALUES (2, 'Spider Man', 'Peter Parker', '') ON CONFLICT (id) DO NOTHING;
INSERT INTO profiles (id, bio, full_name, picture) VALUES (3, 'Smart girl', 'Anna Anniston', '') ON CONFLICT (id) DO NOTHING;

/* Added some users for tests */
/*
   Password_For_Danny
   Password_For_Peter
   Password_For_Anna
*/
INSERT INTO users (id, name, password, profile_id) VALUES (1, 'Danny', '$2a$12$qh8CqFvlgO7rf8hNsvHueeGDTcdmT6L2YZfjTlev.EUP7esjdpRua', 1) ON CONFLICT (name) DO NOTHING;
INSERT INTO users (id, name, password, profile_id) VALUES (2, 'Peter', '$2a$12$KtHWkN8G0KMDvFNMaW85De9vXMW3zb9IyPU9b6gnzWc12PqayZv7G', 2) ON CONFLICT (name) DO NOTHING;
INSERT INTO users (id, name, password, profile_id) VALUES (3, 'Anna', '$2a$12$vTe3TA6JB7ZYK8u/Q75TnO84UfETaZL3NvmPo4g4TXGUTwM/GTi.a', 3) ON CONFLICT (name) DO NOTHING;
