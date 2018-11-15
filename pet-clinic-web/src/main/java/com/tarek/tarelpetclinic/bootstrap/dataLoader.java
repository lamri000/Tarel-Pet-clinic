package com.tarek.tarelpetclinic.bootstrap;

import com.tarek.tarelclinic.model.Owner;
import com.tarek.tarelclinic.model.Vet;
import com.tarek.tarelclinic.services.OwnerService;
import com.tarek.tarelclinic.services.VetService;
import com.tarek.tarelclinic.services.map.OwnerServiceMap;
import com.tarek.tarelclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class dataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public dataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }
            @Override
            public void run(String... args) throws Exception {
                Owner owner1 = new Owner();
                owner1.setId( 1L );
                owner1.setFirstName( "Tarek" );
                owner1.setLastName( "Lamri" );

                ownerService.save( owner1 );

                Owner owner2 = new Owner();
                owner2.setId( 2L );
                owner2.setFirstName( "Abderrahmane" );
                owner2.setLastName( "Lamrii" );

                ownerService.save( owner2 );

                System.out.println( "loaded Owners" );

                Vet vet1 = new Vet();
                vet1.setId( 1L );
                vet1.setFirstName( "wassila" );
                vet1.setLastName( "Lamriii" );

                vetService.save( vet1 );

                Vet vet2 = new Vet();
                vet2.setId( 2L );
                vet2.setFirstName( "Darine" );
                vet2.setLastName( "Lamriiii" );

                vetService.save( vet2 );

                System.out.println( "Loaded Vet" );

            }

    }

