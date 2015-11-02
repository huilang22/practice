/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectAttributeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdObjectAttributeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdObjectAttributeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdObjectAttributeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdObjectAttributeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdObjectAttributeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdObjectAttributeObjectDataList noOpInIn) {
    super(id, context, "BsdObjectAttributeFind");
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
        mapArray[i] = BsdObjectAttributeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdObjectAttribute", noOpIn);
      }
      addInput("BsdObjectAttribute", mapList);
    }
  }
/**
 *
 * Sets the  BsdObjectAttribute
 * @param noOpInIn BsdObjectAttributeObjectDataList to set
 *
 */
  public void setBsdObjectAttribute(BsdObjectAttributeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdObjectAttribute passed into the constructor
 * @return Simulated response
 *
 */
  public BsdObjectAttributeObjectDataList getBsdObjectAttribute() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdObjectAttributeObjectHelper.fromMapList(inputMap, "BsdObjectAttributeList");
  }
}
