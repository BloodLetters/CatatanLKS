// Cara merubah tampilan view fragment
getSupportFragmentManager().beginTransaction().replace(idContainer, new NamaClass).commit();

bottom = findViewById(R.id.bottom_navigation);
    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new DashboardFragment()).commit();
    bottom.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment select = null;

            if (item.getItemId() == R.id.nav_dashboard) {
                select = new DashboardFragment();
            } else if (item.getItemId() == R.id.nav_barang){
                select = new BarangFragment();
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, select).commit();

            return false;
        }
    });
