/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateListByServiceIdBulkUdtTemplateItem.java
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
 * Class used to create a AccountLocateListByServiceIdBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountLocateListByServiceIdBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceLocateXIDObjectFilter ExternalIdEquipMap;
/**
 *
 * Constructor to create a  AccountLocateListByServiceIdBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountLocateListByServiceIdBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceLocateXIDObjectFilter ExternalIdEquipMapIn) {
    super(id, context, "AccountLocateListByServiceId");
    ExternalIdEquipMap = ExternalIdEquipMapIn;
  }

  public void translateToMap() {
    if (ExternalIdEquipMap != null) {
      Integer index =  ExternalIdEquipMap.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExternalIdEquipMap", ServiceLocateXIDObjectHelper.toMap(ExternalIdEquipMap, new HashMap(), "AccountLocate").get("AccountLocate"));
    }
  }


/**
 *
 * Sets the ExternalIdEquipMap
 * @param ExternalIdEquipMapIn Value of the ExternalIdEquipMap
 *
 */

  public void setExternalIdEquipMap(ServiceLocateXIDObjectFilter ExternalIdEquipMapIn) {
    ExternalIdEquipMap = ExternalIdEquipMapIn;
  }

  public void translateFromMap() {
    ExternalIdEquipMap = ServiceLocateXIDObjectHelper.fromMapFilter(inputMap, "ExternalIdEquipMap");
  }

/**
 *
 * Gets the ExternalIdEquipMap
 * @return Value of the ExternalIdEquipMap
 *
 */

  public ServiceLocateXIDObjectFilter getExternalIdEquipMap( ) {
    return ExternalIdEquipMap;
  }

}
