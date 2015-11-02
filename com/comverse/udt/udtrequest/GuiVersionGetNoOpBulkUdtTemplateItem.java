/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GuiVersionGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GuiVersionGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GuiVersionGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GuiVersionObjectData noOpIn;

/**
 *
 * Constructor to create a   GuiVersionGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GuiVersionGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GuiVersionObjectData noOpInIn) {
    super(id, context, "GuiVersionGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GuiVersion", GuiVersionObjectHelper.toMap(noOpIn, new HashMap(), "GuiVersion").get("GuiVersion"));
    }
  }
/**
 *
 * Sets the  GuiVersion
 * @param noOpInIn GuiVersionObjectData to set
 *
 */
  public void setGuiVersion(GuiVersionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GuiVersion passed into the constructor
 * @return Simulated response
 *
 */
  public GuiVersionObjectData getGuiVersion() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GuiVersionObjectHelper.fromMap(inputMap, "GuiVersion");
  }
}
