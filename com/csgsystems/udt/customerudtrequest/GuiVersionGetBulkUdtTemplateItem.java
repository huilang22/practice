/*
 * Generated code DO NOT EDIT
 * Generated file: GuiVersionGetBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a GuiVersionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class GuiVersionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GuiVersionObjectKeyData GVget_In;
/**
 *
 * Constructor to create a  GuiVersionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GuiVersionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, GuiVersionObjectKeyData GVget_InIn) {
    super(id, context, "GuiVersionGet");
    GVget_In = GVget_InIn;
  }

  public void translateToMap() {
    if (GVget_In != null) {
      GVget_In.resetFlags(true, true);
      addInput("GuiVersion", GuiVersionObjectKeyHelper.toMap(GVget_In, new HashMap(), "GuiVersionObjectKeyData").get("GuiVersionObjectKeyData"));
    }
  }


/**
 *
 * Sets the GuiVersion
 * @param GVget_InIn Value of the GVget_In
 *
 */

  public void setGuiVersion(GuiVersionObjectKeyData GVget_InIn) {
    GVget_In = GVget_InIn;
  }

  public void translateFromMap() {
    GVget_In = GuiVersionObjectKeyHelper.fromMap(inputMap, "GuiVersion");
  }

/**
 *
 * Gets the GuiVersion
 * @return Value of the GuiVersion
 *
 */

  public GuiVersionObjectKeyData getGuiVersion( ) {
    return GVget_In;
  }

}
