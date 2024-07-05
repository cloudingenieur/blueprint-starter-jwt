package com.cloudingenieur.blueprint.payload.response;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailAlreadyExitResponse extends AuthenticationResponse{
    private String warning;
}
