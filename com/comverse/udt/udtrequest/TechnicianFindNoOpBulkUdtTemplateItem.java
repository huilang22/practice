/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TechnicianFindNoOpBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a TechnicianFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TechnicianFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TechnicianObjectDataList noOpIn;

/**
 *
 * Constructor to create a   TechnicianFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TechnicianFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TechnicianObjectDataList noOpInIn) {
    super(id, context, "TechnicianFind");
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
        mapArray[i] = TechnicianObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Technician", noOpIn);
      }
      addInput("Technician", mapList);
    }
  }
/**
 *
 * Sets the  Technician
 * @param noOpInIn TechnicianObjectDataList to set
 *
 */
  public void setTechnician(TechnicianObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Technician passed into the constructor
 * @return Simulated response
 *
 */
  public TechnicianObjectDataList getTechnician() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TechnicianObjectHelper.fromMapList(inputMap, "TechnicianList");
  }
}
