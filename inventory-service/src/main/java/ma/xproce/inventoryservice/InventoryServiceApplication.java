package ma.xproce.inventoryservice;

import ma.xproce.inventoryservice.entities.Creator;
import ma.xproce.inventoryservice.entities.Video;
import ma.xproce.inventoryservice.repository.CreatorRepository;
import ma.xproce.inventoryservice.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.ClientInfoStatus;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main ( String[] args ) {
        SpringApplication.run ( InventoryServiceApplication.class , args );
    }

    @Bean
    CommandLineRunner commandLineRunner( CreatorRepository creatorRepository,VideoRepository videoRepository){
        return args -> {
            List<Creator> creatorList = List.of(
                    Creator.builder ().name ( "achraf" ).email ( "achraf@gmail.com" ).build (),
                    Creator.builder ().name ( "amine" ).email ( "amine@gmail.com" ).build (),
                    Creator.builder ().name ( "saad" ).email ( "saad@gmail.com" ).build (),
                    Creator.builder ().name ( "youssef" ).email ( "youssef@gmail.com" ).build ()
            );
            creatorRepository.saveAll ( creatorList );
            List<Video> videos = List.of(
                    Video.builder ().name ( "achraf" ).url ("hello world").description ( "my name achraf" ).creator ( creatorList.get ( 0 ) ).datePublication ( new Date () ).build(),
                    Video.builder ().name ( "amine" ).url ( "hello world 2" ).description ( "my name amine" ).creator ( creatorList.get ( 1 ) ).datePublication ( new Date () ).build (),
                    Video.builder ().name ( "saad" ).url ( "hello world 3 " ).description ( "my name saad" ).creator ( creatorList.get ( 2 ) ).datePublication ( new Date () ).build (),
                    Video.builder ().name ( "youssef" ).url ( "hello world 4" ).description ( "my name youssef" ).creator ( creatorList.get ( 3 ) ).datePublication ( new Date () ).build ()
            );
            videoRepository.saveAll ( videos );

        };
    }

}
