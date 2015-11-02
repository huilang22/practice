/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdAttributeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdAttributeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdAttributeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdAttributeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdAttributeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeObjectDataList noOpInIn) {
    super(id, context, "BsdAttributeFind");
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
        mapArray[i] = BsdAttributeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdAttribute", noOpIn);
      }
      addInput("BsdAttribute", mapList);
    }
  }
/**
 *
 * Sets the  BsdAttribute
 * @param noOpInIn BsdAttributeObjectDataList to set
 *
 */
  public void setBsdAttribute(BsdAttributeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdAttribute passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeObjectDataList getBsdAttribute() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdAttributeObjectHelper.fromMapList(inputMap, "BsdAttributeList");
  }
}
