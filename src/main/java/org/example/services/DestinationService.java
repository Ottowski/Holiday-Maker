package org.example.services;

import org.example.repository.destinationRepo.DestinationRepositoryImp;

public class DestinationService {

private DestinationRepositoryImp destinationRepositoryImp;

    public DestinationService(DestinationRepositoryImp destinationRepositoryImp) {
        this.destinationRepositoryImp = destinationRepositoryImp;
    }

    public void getAllDestinations() {
        var destinations = destinationRepositoryImp.getAllDestinations();
        System.out.println("All Trips: ");
        for (var destination : destinations) {
            System.out.println(destination);
        }

    }
}
