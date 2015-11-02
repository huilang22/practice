/*
 * Generated code DO NOT EDIT
 * Generated file: NetworkStatusNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a NetworkStatusNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NetworkStatusNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NetworkStatusOutputData noOpIn;

/**
 *
 * Constructor to create a   NetworkStatusNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NetworkStatusNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NetworkStatusOutputData noOpInIn) {
    super(id, context, "NetworkStatus");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("NetworkStatusOutputData", NetworkStatusOutputHelper.toMap(noOpIn).get("NetworkStatusOutputData"));
    }
  }
/**
 *
 * Sets the  NetworkStatusOutputData
 * @param noOpInIn NetworkStatusOutputData to set
 *
 */
  public void setNetworkStatusOutputData(NetworkStatusOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NetworkStatusOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public NetworkStatusOutputData getNetworkStatusOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NetworkStatusOutputHelper.fromMap(inputMap);
  }
}
