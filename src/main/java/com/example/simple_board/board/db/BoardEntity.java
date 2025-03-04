package com.example.simple_board.board.db;

import com.example.simple_board.post.db.PostEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OrderBy;
import org.hibernate.annotations.Where;
import org.springframework.core.annotation.Order;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity(name="board")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private  String boardName;

    private String status;

    @OneToMany(
            mappedBy = "board"
    )
    @Builder.Default
    @Where(clause = "status='REGISTERED'")
//    @org.hibernate.annotations.OrderBy(clause = "id desc")
    @OrderBy(clause = "id desc")
    private List<PostEntity> postList = List.of();


}
