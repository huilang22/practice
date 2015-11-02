/*
 * Generated code DO NOT EDIT
 * Generated file: ServerDefinitionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServerDefinitionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServerDefinitionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServerDefinitionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServerDefinitionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServerDefinitionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServerDefinitionObjectDataList noOpInIn) {
    super(id, context, "ServerDefinitionFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = ServerDefinitionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServerDefinition", noOpIn);
      }
      addInput("ServerDefinition", mapList);
    }
  }
/**
 *
 * Sets the  ServerDefinition
 * @param noOpInIn ServerDefinitionObjectDataList to set
 *
 */
  public void setServerDefinition(ServerDefinitionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServerDefinition passed into the constructor
 * @return Simulated response
 *
 */
  public ServerDefinitionObjectDataList getServerDefinition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServerDefinitionObjectHelper.fromMapList(inputMap, "ServerDefinitionList");
  }
}
