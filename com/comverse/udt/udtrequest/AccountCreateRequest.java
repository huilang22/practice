/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCreateRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a AccountCreateRequest Udt Request
 *
 */

public class AccountCreateRequest extends AccountSubRequestParent {
/**
 *
 * Constructor to create a  AccountCreateRequest
 * @param id Unique request name
 * @param acIn AccountXIDObjectData for AccountCreateRequest
 * @param _____PaymentProfile PaymentProfileObjectData for AccountCreateRequest
 * @param billingSC Integer for AccountCreateRequest
 * @param remitSC Integer for AccountCreateRequest
 * @param inquirySC Integer for AccountCreateRequest
 * @param collectionSC Integer for AccountCreateRequest
 * @param printSC Integer for AccountCreateRequest
 * @param server_category Integer for AccountCreateRequest
 *
 */
@JsonCreator
  public AccountCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Account")AccountXIDObjectData acIn, @JsonProperty("PaymentProfile")PaymentProfileObjectData _____PaymentProfile, @JsonProperty("BillingServiceCenterId")Integer billingSC, @JsonProperty("RemitServiceCenterId")Integer remitSC, @JsonProperty("InquiryServiceCenterId")Integer inquirySC, @JsonProperty("CollectionServiceCenterId")Integer collectionSC, @JsonProperty("PrintServiceCenterId")Integer printSC, @JsonProperty("ServerCategory")Integer server_category) {
    super(id, "AccountCreate");
    if (acIn != null) {
      addInput("Account", AccountXIDObjectHelper.toMap(acIn, new HashMap(), "AccountCreateOutputData").get("AccountCreateOutputData"));
    }
    if (_____PaymentProfile != null) {
      addInput("PaymentProfile", PaymentProfileObjectHelper.toMap(_____PaymentProfile, new HashMap(), "AccountCreateOutputData").get("AccountCreateOutputData"));
    }
    if (billingSC != null) {
      addInput("BillingServiceCenterId", billingSC);
    }
    if (remitSC != null) {
      addInput("RemitServiceCenterId", remitSC);
    }
    if (inquirySC != null) {
      addInput("InquiryServiceCenterId", inquirySC);
    }
    if (collectionSC != null) {
      addInput("CollectionServiceCenterId", collectionSC);
    }
    if (printSC != null) {
      addInput("PrintServiceCenterId", printSC);
    }
    if (server_category != null) {
      addInput("ServerCategory", server_category);
    }
  }

/**
 *
 * Retrieves the AccountCreateOutputData that results from the AccountCreateRequest call
 * @return AccountCreateOutputData resulting from udt call
 *
 */

  public AccountCreateOutputData getOutput() {
    return AccountCreateOutputHelper.fromMap(outputMap);
  }
}
