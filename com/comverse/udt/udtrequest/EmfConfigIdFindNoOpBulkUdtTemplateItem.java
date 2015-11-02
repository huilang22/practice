/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigIdFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a EmfConfigIdFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EmfConfigIdFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ECIObjectDataList noOpIn;

/**
 *
 * Constructor to create a   EmfConfigIdFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EmfConfigIdFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ECIObjectDataList noOpInIn) {
    super(id, context, "EmfConfigIdFind");
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
        mapArray[i] = ECIObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EmfConfigId", noOpIn);
      }
      addInput("EmfConfigId", mapList);
    }
  }
/**
 *
 * Sets the  EmfConfigId
 * @param noOpInIn ECIObjectDataList to set
 *
 */
  public void setEmfConfigId(ECIObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EmfConfigId passed into the constructor
 * @return Simulated response
 *
 */
  public ECIObjectDataList getEmfConfigId() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ECIObjectHelper.fromMapList(inputMap, "EmfConfigIdList");
  }
}
