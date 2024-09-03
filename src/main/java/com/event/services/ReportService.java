package com.event.services;

public class ReportService {
    public static void Report() throws Exception{
        System.out.println("====\tGENERATING...");
        Thread.sleep(1000);
        System.out.println("====\tEVENTS:");
        EventService.showEvents();
        Thread.sleep(300);
        System.out.println("====\tPARTICIPANTS:");
        ParticipantService.showParticipants();
        Thread.sleep(300);
        System.out.println("====\tINSCRIPTIONS:");
        InscriptionService.TotalInscriptions();
    }
}
