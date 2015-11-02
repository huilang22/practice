/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateFindByServiceExtendeddataBulkUdtTemplateItem.java
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
 * Class used to create a AccountLocateFindByServiceExtendeddataBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountLocateFindByServiceExtendeddataBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceExtendedDataLocateXIDObjectFilter alsedfIn;
/**
 *
 * Constructor to create a  AccountLocateFindByServiceExtendeddataBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountLocateFindByServiceExtendeddataBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceExtendedDataLocateXIDObjectFilter alsedfInIn) {
    super(id, context, "AccountLocateFindByServiceExtendeddata");
    alsedfIn = alsedfInIn;
  }

  public void translateToMap() {
    if (alsedfIn != null) {
      Integer index =  alsedfIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AlsedfIn", ServiceExtendedDataLocateXIDObjectHelper.toMap(alsedfIn, new HashMap(), "AccountLocate").get("AccountLocate"));
    }
  }


/**
 *
 * Sets the AlsedfIn
 * @param alsedfInIn Value of the alsedfIn
 *
 */

  public void setAlsedfIn(ServiceExtendedDataLocateXIDObjectFilter alsedfInIn) {
    alsedfIn = alsedfInIn;
  }

  public void translateFromMap() {
    alsedfIn = ServiceExtendedDataLocateXIDObjectHelper.fromMapFilter(inputMap, "AlsedfIn");
  }

/**
 *
 * Gets the AlsedfIn
 * @return Value of the AlsedfIn
 *
 */

  public ServiceExtendedDataLocateXIDObjectFilter getAlsedfIn( ) {
    return alsedfIn;
  }

}
