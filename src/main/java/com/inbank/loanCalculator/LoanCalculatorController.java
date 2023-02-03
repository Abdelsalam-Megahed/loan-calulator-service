package com.inbank.loanCalculator;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/calculate")
public class LoanCalculatorController {
    private final LoanCalculatorService loanCalculatorService;

    @PostMapping
    public ResponseEntity<LoanCalculatorResponse> calculateMaximumLoanAmount(@RequestBody @Valid LoanCalculatorRequest loanCalculatorRequest) throws Exception {
        LoanCalculatorResponse response = loanCalculatorService.calculateMaximumLoanAmount(loanCalculatorRequest);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
