/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentDisconnectChargeAmountGetRequest.java
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
 * Class used to create a ComponentDisconnectChargeAmountGetRequest Udt Request
 *
 */

public class ComponentDisconnectChargeAmountGetRequest extends CustomerContractSubRequestParent {
/**
 *
 * Constructor to create a  ComponentDisconnectChargeAmountGetRequest
 * @param id Unique request name
 * @param comp_inst_id Integer for ComponentDisconnectChargeAmountGetRequest
 * @param comp_inst_id_serv Integer for ComponentDisconnectChargeAmountGetRequest
 * @param disconnect_date Date for ComponentDisconnectChargeAmountGetRequest
 *
 */
@JsonCreator
  public ComponentDisconnectChargeAmountGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CompInstId")Integer comp_inst_id, @JsonProperty("CompInstIdServ")Integer comp_inst_id_serv, @JsonProperty("DisconnectDate")Date disconnect_date) {
    super(id, "ComponentDisconnectChargeAmountGet");
    if (comp_inst_id != null) {
      addInput("CompInstId", comp_inst_id);
    }
    if (comp_inst_id_serv != null) {
      addInput("CompInstIdServ", comp_inst_id_serv);
    }
    if (disconnect_date != null) {
      addInput("DisconnectDate", disconnect_date);
    }
  }

/**
 *
 * Retrieves the ComponentDisconnectChargeAmountGetOutputData that results from the ComponentDisconnectChargeAmountGetRequest call
 * @return ComponentDisconnectChargeAmountGetOutputData resulting from udt call
 *
 */

  public ComponentDisconnectChargeAmountGetOutputData getOutput() {
    return ComponentDisconnectChargeAmountGetOutputHelper.fromMap(outputMap);
  }
}
