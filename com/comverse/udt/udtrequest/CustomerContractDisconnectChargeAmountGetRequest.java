/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractDisconnectChargeAmountGetRequest.java
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
 * Class used to create a CustomerContractDisconnectChargeAmountGetRequest Udt Request
 *
 */

public class CustomerContractDisconnectChargeAmountGetRequest extends CustomerContractSubRequestParent {
/**
 *
 * Constructor to create a  CustomerContractDisconnectChargeAmountGetRequest
 * @param id Unique request name
 * @param contract_tracking_id Integer for CustomerContractDisconnectChargeAmountGetRequest
 * @param contract_tracking_id_serv Integer for CustomerContractDisconnectChargeAmountGetRequest
 * @param _disconnect_date Date for CustomerContractDisconnectChargeAmountGetRequest
 *
 */
@JsonCreator
  public CustomerContractDisconnectChargeAmountGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ContractTrackingId")Integer contract_tracking_id, @JsonProperty("ContractTrackingIdServ")Integer contract_tracking_id_serv, @JsonProperty("DisconnectDate")Date _disconnect_date) {
    super(id, "CustomerContractDisconnectChargeAmountGet");
    if (contract_tracking_id != null) {
      addInput("ContractTrackingId", contract_tracking_id);
    }
    if (contract_tracking_id_serv != null) {
      addInput("ContractTrackingIdServ", contract_tracking_id_serv);
    }
    if (_disconnect_date != null) {
      addInput("DisconnectDate", _disconnect_date);
    }
  }

/**
 *
 * Retrieves the CustomerContractDisconnectChargeAmountGetOutputData that results from the CustomerContractDisconnectChargeAmountGetRequest call
 * @return CustomerContractDisconnectChargeAmountGetOutputData resulting from udt call
 *
 */

  public CustomerContractDisconnectChargeAmountGetOutputData getOutput() {
    return CustomerContractDisconnectChargeAmountGetOutputHelper.fromMap(outputMap);
  }
}
