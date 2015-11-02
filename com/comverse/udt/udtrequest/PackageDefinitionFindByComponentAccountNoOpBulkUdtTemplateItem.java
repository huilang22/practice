/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageDefinitionFindByComponentAccountNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PackageDefinitionFindByComponentAccountNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PackageDefinitionFindByComponentAccountNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PackageDefinitionFindByComponentAccountNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PackageDefinitionFindByComponentAccountNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PDObjectDataList noOpInIn) {
    super(id, context, "PackageDefinitionFindByComponentAccount");
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
        mapArray[i] = PDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PackageDefinition", noOpIn);
      }
      addInput("PackageDefinition", mapList);
    }
  }
/**
 *
 * Sets the  PackageDefinition
 * @param noOpInIn PDObjectDataList to set
 *
 */
  public void setPackageDefinition(PDObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PackageDefinition passed into the constructor
 * @return Simulated response
 *
 */
  public PDObjectDataList getPackageDefinition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PDObjectHelper.fromMapList(inputMap, "PackageDefinitionList");
  }
}
