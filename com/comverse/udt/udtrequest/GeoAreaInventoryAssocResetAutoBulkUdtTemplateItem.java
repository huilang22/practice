/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaInventoryAssocResetAutoBulkUdtTemplateItem.java
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
import com.csgsystems.svbl.data.*;

/**
 *
 * Class used to create a GeoAreaInventoryAssocResetAutoBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaInventoryAssocResetAutoBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer inventory_id;
  protected Integer inventory_id_resets;
/**
 *
 * Constructor to create a  GeoAreaInventoryAssocResetAutoBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaInventoryAssocResetAutoBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer inventory_idIn, Integer inventory_id_resetsIn) {
    super(id, context, "GeoAreaInventoryAssocResetAuto");
    inventory_id = inventory_idIn;
    inventory_id_resets = inventory_id_resetsIn;
  }

  public void translateToMap() {
    if (inventory_id != null) {
      addInput("InventoryId", inventory_id);
    }
    if (inventory_id_resets != null) {
      addInput("InventoryIdResets", inventory_id_resets);
    }
  }


/**
 *
 * Sets the InventoryId
 * @param inventory_idIn Value of the inventory_id
 *
 */

  public void setInventoryId(Integer inventory_idIn) {
    inventory_id = inventory_idIn;
  }

/**
 *
 * Sets the InventoryIdResets
 * @param inventory_id_resetsIn Value of the inventory_id_resets
 *
 */

  public void setInventoryIdResets(Integer inventory_id_resetsIn) {
    inventory_id_resets = inventory_id_resetsIn;
  }

  public void translateFromMap() {
    inventory_id = (Integer)inputMap.get("InventoryId");
    inventory_id_resets = (Integer)inputMap.get("InventoryIdResets");
  }

/**
 *
 * Gets the InventoryId
 * @return Value of the InventoryId
 *
 */

  public Integer getInventoryId( ) {
    return inventory_id;
  }

/**
 *
 * Gets the InventoryIdResets
 * @return Value of the InventoryIdResets
 *
 */

  public Integer getInventoryIdResets( ) {
    return inventory_id_resets;
  }

}
