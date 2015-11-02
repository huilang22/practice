/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractDeleteRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CustomerContractDeleteRequest Udt Request
 *
 */

public class CustomerContractDeleteRequest extends CustomerContractSubRequestParent {
/**
 *
 * Constructor to create a  CustomerContractDeleteRequest
 * @param id Unique request name
 * @param CustomerContractDeleteIn CustomerContractObjectBaseKeyData for CustomerContractDeleteRequest
 * @param waive_termination_charge Integer for CustomerContractDeleteRequest
 * @param waive_commitment_charge Integer for CustomerContractDeleteRequest
 * @param CCDCeaseDate Date for CustomerContractDeleteRequest
 *
 */
@JsonCreator
  public CustomerContractDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerContract")CustomerContractObjectBaseKeyData CustomerContractDeleteIn, @JsonProperty("WaiveTerminationCharge")Integer waive_termination_charge, @JsonProperty("WaiveCommitmentCharge")Integer waive_commitment_charge, @JsonProperty("CCDCeaseDate")Date CCDCeaseDate) {
    super(id, "CustomerContractDelete");
    if (CustomerContractDeleteIn != null) {
      addInput("CustomerContract", CustomerContractObjectBaseKeyHelper.toMap(CustomerContractDeleteIn, new HashMap(), "CustomerContractObjectBaseKeyData").get("CustomerContractObjectBaseKeyData"));
    }
    if (waive_termination_charge != null) {
      addInput("WaiveTerminationCharge", waive_termination_charge);
    }
    if (waive_commitment_charge != null) {
      addInput("WaiveCommitmentCharge", waive_commitment_charge);
    }
    if (CCDCeaseDate != null) {
      addInput("CCDCeaseDate", CCDCeaseDate);
    }
  }

/**
 *
 * Retrieves the CustomerContractObjectBaseData that results from the CustomerContractDeleteRequest call
 * @return CustomerContractObjectBaseData resulting from udt call
 *
 */

  public CustomerContractObjectBaseData getOutput() {
    return CustomerContractObjectBaseHelper.fromMap(outputMap, "CustomerContract");
  }
}
