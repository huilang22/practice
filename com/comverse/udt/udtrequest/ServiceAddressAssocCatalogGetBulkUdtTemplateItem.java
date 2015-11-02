/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocCatalogGetBulkUdtTemplateItem.java
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
 * Class used to create a ServiceAddressAssocCatalogGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceAddressAssocCatalogGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceAddressAssocCatalogObjKeyData getIn;
/**
 *
 * Constructor to create a  ServiceAddressAssocCatalogGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceAddressAssocCatalogGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceAddressAssocCatalogObjKeyData getInIn) {
    super(id, context, "ServiceAddressAssocCatalogGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("ServiceAddressAssocCatalog", ServiceAddressAssocCatalogObjKeyHelper.toMap(getIn, new HashMap(), "ServiceAddressAssocCatalogObjKeyData").get("ServiceAddressAssocCatalogObjKeyData"));
    }
  }


/**
 *
 * Sets the ServiceAddressAssocCatalog
 * @param getInIn Value of the getIn
 *
 */

  public void setServiceAddressAssocCatalog(ServiceAddressAssocCatalogObjKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = ServiceAddressAssocCatalogObjKeyHelper.fromMap(inputMap, "ServiceAddressAssocCatalog");
  }

/**
 *
 * Gets the ServiceAddressAssocCatalog
 * @return Value of the ServiceAddressAssocCatalog
 *
 */

  public ServiceAddressAssocCatalogObjKeyData getServiceAddressAssocCatalog( ) {
    return getIn;
  }

}
