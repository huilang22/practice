/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityAciFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a SecurityAciFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SecurityAciFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SecurityAciObjectDataList noOpIn;

/**
 *
 * Constructor to create a   SecurityAciFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SecurityAciFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SecurityAciObjectDataList noOpInIn) {
    super(id, context, "SecurityAciFind");
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
        mapArray[i] = SecurityAciObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SecurityAci", noOpIn);
      }
      addInput("SecurityAci", mapList);
    }
  }
/**
 *
 * Sets the  SecurityAci
 * @param noOpInIn SecurityAciObjectDataList to set
 *
 */
  public void setSecurityAci(SecurityAciObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SecurityAci passed into the constructor
 * @return Simulated response
 *
 */
  public SecurityAciObjectDataList getSecurityAci() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SecurityAciObjectHelper.fromMapList(inputMap, "SecurityAciList");
  }
}
