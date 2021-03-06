/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package mortgages.mortgages;

public class LoanApplication extends Object implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    // @org.kie.api.definition.type.Position(value = 0)
    private Integer amount;

    // @org.kie.api.definition.type.Position(value = 1)
    private Boolean approved;

    // @org.kie.api.definition.type.Position(value = 3)
    private Integer approvedRate;

    // @org.kie.api.definition.type.Position(value = 2)
    private Integer deposit;

    // @org.kie.api.definition.type.Position(value = 5)
    private String explanation;

    // @org.kie.api.definition.type.Position(value = 6)
    private Integer insuranceCost;

    // @org.kie.api.definition.type.Position(value = 4)
    private Integer lengthYears;

    public LoanApplication() {
    }

    public LoanApplication(Integer amount, Boolean approved, Integer deposit, Integer approvedRate, Integer lengthYears,
            String explanation, Integer insuranceCost) {
        this.amount = amount;
        this.approved = approved;
        this.deposit = deposit;
        this.approvedRate = approvedRate;
        this.lengthYears = lengthYears;
        this.explanation = explanation;
        this.insuranceCost = insuranceCost;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Boolean getApproved() {
        return this.approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public Integer getApprovedRate() {
        return this.approvedRate;
    }

    public void setApprovedRate(Integer approvedRate) {
        this.approvedRate = approvedRate;
    }

    public Integer getDeposit() {
        return this.deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public String getExplanation() {
        return this.explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public Integer getInsuranceCost() {
        return this.insuranceCost;
    }

    public void setInsuranceCost(Integer insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    public Integer getLengthYears() {
        return this.lengthYears;
    }

    public void setLengthYears(Integer lengthYears) {
        this.lengthYears = lengthYears;
    }
}
