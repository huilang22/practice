/*
 * Generated code DO NOT EDIT
 * Generated file: GuiIndicatorFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GuiIndicatorFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GuiIndicatorFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GuiIndicatorObjectDataList noOpIn;

/**
 *
 * Constructor to create a   GuiIndicatorFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GuiIndicatorFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GuiIndicatorObjectDataList noOpInIn) {
    super(id, context, "GuiIndicatorFind");
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
        mapArray[i] = GuiIndicatorObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GuiIndicator", noOpIn);
      }
      addInput("GuiIndicator", mapList);
    }
  }
/**
 *
 * Sets the  GuiIndicator
 * @param noOpInIn GuiIndicatorObjectDataList to set
 *
 */
  public void setGuiIndicator(GuiIndicatorObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GuiIndicator passed into the constructor
 * @return Simulated response
 *
 */
  public GuiIndicatorObjectDataList getGuiIndicator() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GuiIndicatorObjectHelper.fromMapList(inputMap, "GuiIndicatorList");
  }
}
