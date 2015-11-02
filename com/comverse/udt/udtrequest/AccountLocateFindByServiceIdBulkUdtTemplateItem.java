/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateFindByServiceIdBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a AccountLocateFindByServiceIdBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountLocateFindByServiceIdBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceLocateXIDObjectFilter alsfIn;
/**
 *
 * Constructor to create a  AccountLocateFindByServiceIdBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountLocateFindByServiceIdBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceLocateXIDObjectFilter alsfInIn) {
    super(id, context, "AccountLocateFindByServiceId");
    alsfIn = alsfInIn;
  }

  public void translateToMap() {
    if (alsfIn != null) {
      Integer index =  alsfIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExternalIdEquipMap", ServiceLocateXIDObjectHelper.toMap(alsfIn, new HashMap(), "AccountLocate").get("AccountLocate"));
    }
  }


/**
 *
 * Sets the ExternalIdEquipMap
 * @param alsfInIn Value of the alsfIn
 *
 */

  public void setExternalIdEquipMap(ServiceLocateXIDObjectFilter alsfInIn) {
    alsfIn = alsfInIn;
  }

  public void translateFromMap() {
    alsfIn = ServiceLocateXIDObjectHelper.fromMapFilter(inputMap, "ExternalIdEquipMap");
  }

/**
 *
 * Gets the ExternalIdEquipMap
 * @return Value of the ExternalIdEquipMap
 *
 */

  public ServiceLocateXIDObjectFilter getExternalIdEquipMap( ) {
    return alsfIn;
  }

}
