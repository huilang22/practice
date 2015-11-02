/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationAttributeDefaultFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdApplicationAttributeDefaultFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdApplicationAttributeDefaultFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdApplicationAttributeDefaultObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdApplicationAttributeDefaultFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdApplicationAttributeDefaultFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationAttributeDefaultObjectDataList noOpInIn) {
    super(id, context, "BsdApplicationAttributeDefaultFind");
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
        mapArray[i] = BsdApplicationAttributeDefaultObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdApplicationAttributeDefault", noOpIn);
      }
      addInput("BsdApplicationAttributeDefault", mapList);
    }
  }
/**
 *
 * Sets the  BsdApplicationAttributeDefault
 * @param noOpInIn BsdApplicationAttributeDefaultObjectDataList to set
 *
 */
  public void setBsdApplicationAttributeDefault(BsdApplicationAttributeDefaultObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdApplicationAttributeDefault passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationAttributeDefaultObjectDataList getBsdApplicationAttributeDefault() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdApplicationAttributeDefaultObjectHelper.fromMapList(inputMap, "BsdApplicationAttributeDefaultList");
  }
}
