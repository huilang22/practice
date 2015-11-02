/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GuiVersionFindBulkUdtTemplateItem.java
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
 * Class used to create a GuiVersionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class GuiVersionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GuiVersionObjectFilter GVfind_In;
/**
 *
 * Constructor to create a  GuiVersionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GuiVersionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, GuiVersionObjectFilter GVfind_InIn) {
    super(id, context, "GuiVersionFind");
    GVfind_In = GVfind_InIn;
  }

  public void translateToMap() {
    if (GVfind_In != null) {
      Integer index =  GVfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GuiVersion", GuiVersionObjectHelper.toMap(GVfind_In, new HashMap(), "GuiVersion").get("GuiVersion"));
    }
  }


/**
 *
 * Sets the GuiVersion
 * @param GVfind_InIn Value of the GVfind_In
 *
 */

  public void setGuiVersion(GuiVersionObjectFilter GVfind_InIn) {
    GVfind_In = GVfind_InIn;
  }

  public void translateFromMap() {
    GVfind_In = GuiVersionObjectHelper.fromMapFilter(inputMap, "GuiVersion");
  }

/**
 *
 * Gets the GuiVersion
 * @return Value of the GuiVersion
 *
 */

  public GuiVersionObjectFilter getGuiVersion( ) {
    return GVfind_In;
  }

}
