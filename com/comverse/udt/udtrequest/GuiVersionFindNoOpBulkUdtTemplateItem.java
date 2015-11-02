/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GuiVersionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GuiVersionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GuiVersionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GuiVersionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   GuiVersionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GuiVersionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GuiVersionObjectDataList noOpInIn) {
    super(id, context, "GuiVersionFind");
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
        mapArray[i] = GuiVersionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GuiVersion", noOpIn);
      }
      addInput("GuiVersion", mapList);
    }
  }
/**
 *
 * Sets the  GuiVersion
 * @param noOpInIn GuiVersionObjectDataList to set
 *
 */
  public void setGuiVersion(GuiVersionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GuiVersion passed into the constructor
 * @return Simulated response
 *
 */
  public GuiVersionObjectDataList getGuiVersion() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GuiVersionObjectHelper.fromMapList(inputMap, "GuiVersionList");
  }
}
