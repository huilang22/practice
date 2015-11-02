/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocCatalogFindBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ServiceAddressAssocCatalogFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceAddressAssocCatalogFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceAddressAssocCatalogObjFilter findIn;
/**
 *
 * Constructor to create a  ServiceAddressAssocCatalogFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceAddressAssocCatalogFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceAddressAssocCatalogObjFilter findInIn) {
    super(id, context, "ServiceAddressAssocCatalogFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceAddressAssocCatalog", ServiceAddressAssocCatalogObjHelper.toMap(findIn, new HashMap(), "ServiceAddressAssocCatalog").get("ServiceAddressAssocCatalog"));
    }
  }


/**
 *
 * Sets the ServiceAddressAssocCatalog
 * @param findInIn Value of the findIn
 *
 */

  public void setServiceAddressAssocCatalog(ServiceAddressAssocCatalogObjFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = ServiceAddressAssocCatalogObjHelper.fromMapFilter(inputMap, "ServiceAddressAssocCatalog");
  }

/**
 *
 * Gets the ServiceAddressAssocCatalog
 * @return Value of the ServiceAddressAssocCatalog
 *
 */

  public ServiceAddressAssocCatalogObjFilter getServiceAddressAssocCatalog( ) {
    return findIn;
  }

}
